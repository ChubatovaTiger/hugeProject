package subProj_1210

import subProj_1210.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1210")
    name = "subProj 1210"

    buildType(subProj_bt_1210_1)
    buildType(subProj_bt_1210_0)
    buildType(subProj_bt_1210_5)
    buildType(subProj_bt_1210_4)
    buildType(subProj_bt_1210_3)
    buildType(subProj_bt_1210_2)
})
