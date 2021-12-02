package subProj_1923

import subProj_1923.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1923")
    name = "subProj 1923"

    buildType(subProj_bt_1923_0)
    buildType(subProj_bt_1923_3)
    buildType(subProj_bt_1923_4)
    buildType(subProj_bt_1923_1)
    buildType(subProj_bt_1923_2)
    buildType(subProj_bt_1923_5)
})
