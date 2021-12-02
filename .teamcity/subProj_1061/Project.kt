package subProj_1061

import subProj_1061.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1061")
    name = "subProj 1061"

    buildType(subProj_bt_1061_5)
    buildType(subProj_bt_1061_4)
    buildType(subProj_bt_1061_1)
    buildType(subProj_bt_1061_0)
    buildType(subProj_bt_1061_3)
    buildType(subProj_bt_1061_2)
})
