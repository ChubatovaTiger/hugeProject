package subProj_653

import subProj_653.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_653")
    name = "subProj 653"

    buildType(subProj_bt_653_4)
    buildType(subProj_bt_653_5)
    buildType(subProj_bt_653_2)
    buildType(subProj_bt_653_3)
    buildType(subProj_bt_653_0)
    buildType(subProj_bt_653_1)
})
