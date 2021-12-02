package subProj_417

import subProj_417.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_417")
    name = "subProj 417"

    buildType(subProj_bt_417_0)
    buildType(subProj_bt_417_1)
    buildType(subProj_bt_417_2)
    buildType(subProj_bt_417_3)
    buildType(subProj_bt_417_4)
    buildType(subProj_bt_417_5)
})
