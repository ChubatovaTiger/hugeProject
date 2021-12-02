package subProj_1751

import subProj_1751.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1751")
    name = "subProj 1751"

    buildType(subProj_bt_1751_5)
    buildType(subProj_bt_1751_4)
    buildType(subProj_bt_1751_3)
    buildType(subProj_bt_1751_2)
    buildType(subProj_bt_1751_1)
    buildType(subProj_bt_1751_0)
})
