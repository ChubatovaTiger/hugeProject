package subProj_1255

import subProj_1255.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1255")
    name = "subProj 1255"

    buildType(subProj_bt_1255_2)
    buildType(subProj_bt_1255_1)
    buildType(subProj_bt_1255_4)
    buildType(subProj_bt_1255_3)
    buildType(subProj_bt_1255_5)
    buildType(subProj_bt_1255_0)
})
