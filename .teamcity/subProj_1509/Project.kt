package subProj_1509

import subProj_1509.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1509")
    name = "subProj 1509"

    buildType(subProj_bt_1509_0)
    buildType(subProj_bt_1509_2)
    buildType(subProj_bt_1509_1)
    buildType(subProj_bt_1509_4)
    buildType(subProj_bt_1509_3)
    buildType(subProj_bt_1509_5)
})
