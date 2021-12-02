package subProj_1670

import subProj_1670.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1670")
    name = "subProj 1670"

    buildType(subProj_bt_1670_2)
    buildType(subProj_bt_1670_3)
    buildType(subProj_bt_1670_0)
    buildType(subProj_bt_1670_1)
    buildType(subProj_bt_1670_4)
    buildType(subProj_bt_1670_5)
})
