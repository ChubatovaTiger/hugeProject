package subProj_969

import subProj_969.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_969")
    name = "subProj 969"

    buildType(subProj_bt_969_1)
    buildType(subProj_bt_969_0)
    buildType(subProj_bt_969_3)
    buildType(subProj_bt_969_2)
    buildType(subProj_bt_969_5)
    buildType(subProj_bt_969_4)
})
