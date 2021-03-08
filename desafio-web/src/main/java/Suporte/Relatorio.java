package Suporte;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

public class Relatorio {

    private static final ExtentReports extent = GeradorRelatorio.getInstance();
    private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static void createTest(String nomeTeste, TipoRelatorio tipoRelatorio) {
        if (tipoRelatorio.equals(TipoRelatorio.INDIVIDUAL)) {
            ExtentTest extentTest = extent.createTest(nomeTeste);
            test.set(extentTest);

            return;
        }

        ExtentTest extentTest = extent.createTest(nomeTeste);
        parentTest.set(extentTest);
    }

    public static void criarPasso(String nomePasso) {
        try {
            ExtentTest child = parentTest.get().createNode(nomePasso);
            test.set(child);
        } catch (NullPointerException ignored) {
            ignored.getMessage();
        }
    }

    public static void log(Status status, String message) {
        if (existInstance()) {
            return;
        }

        test.get().log(status, message);
    }

    public static void log(Status status, String message, MediaEntityModelProvider capture) {
        if (existInstance()) {
            return;
        }

        test.get().log(status, message, capture);
    }

    private static boolean existInstance() {
        if (test.get() == null) {
            return true;
        }

        return false;
    }
    public static void close() {
        if (existInstance()) {
            return;
        }

        extent.flush();
    }

}
