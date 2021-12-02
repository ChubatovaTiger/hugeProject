package subProj_1393

import subProj_1393.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1393")
    name = "subProj 1393"

    buildType(subProj_bt_1393_1)
    buildType(subProj_bt_1393_0)
    buildType(subProj_bt_1393_3)
    buildType(subProj_bt_1393_2)
    buildType(subProj_bt_1393_5)
    buildType(subProj_bt_1393_4)
})
