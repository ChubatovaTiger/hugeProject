package subProj_509

import subProj_509.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_509")
    name = "subProj 509"

    buildType(subProj_bt_509_4)
    buildType(subProj_bt_509_5)
    buildType(subProj_bt_509_2)
    buildType(subProj_bt_509_3)
    buildType(subProj_bt_509_0)
    buildType(subProj_bt_509_1)
})
