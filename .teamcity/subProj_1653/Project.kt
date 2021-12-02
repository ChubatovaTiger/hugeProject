package subProj_1653

import subProj_1653.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1653")
    name = "subProj 1653"

    buildType(subProj_bt_1653_0)
    buildType(subProj_bt_1653_2)
    buildType(subProj_bt_1653_1)
    buildType(subProj_bt_1653_4)
    buildType(subProj_bt_1653_3)
    buildType(subProj_bt_1653_5)
})
