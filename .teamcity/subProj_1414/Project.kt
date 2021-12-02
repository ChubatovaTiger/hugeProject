package subProj_1414

import subProj_1414.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1414")
    name = "subProj 1414"

    buildType(subProj_bt_1414_5)
    buildType(subProj_bt_1414_4)
    buildType(subProj_bt_1414_3)
    buildType(subProj_bt_1414_2)
    buildType(subProj_bt_1414_1)
    buildType(subProj_bt_1414_0)
})
