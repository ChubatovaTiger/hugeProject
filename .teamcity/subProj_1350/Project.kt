package subProj_1350

import subProj_1350.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1350")
    name = "subProj 1350"

    buildType(subProj_bt_1350_4)
    buildType(subProj_bt_1350_3)
    buildType(subProj_bt_1350_2)
    buildType(subProj_bt_1350_1)
    buildType(subProj_bt_1350_0)
    buildType(subProj_bt_1350_5)
})
