package subProj_1895

import subProj_1895.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1895")
    name = "subProj 1895"

    buildType(subProj_bt_1895_5)
    buildType(subProj_bt_1895_4)
    buildType(subProj_bt_1895_3)
    buildType(subProj_bt_1895_2)
    buildType(subProj_bt_1895_1)
    buildType(subProj_bt_1895_0)
})
