package subProj_1586

import subProj_1586.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1586")
    name = "subProj 1586"

    buildType(subProj_bt_1586_5)
    buildType(subProj_bt_1586_4)
    buildType(subProj_bt_1586_1)
    buildType(subProj_bt_1586_0)
    buildType(subProj_bt_1586_3)
    buildType(subProj_bt_1586_2)
})
