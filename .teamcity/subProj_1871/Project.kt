package subProj_1871

import subProj_1871.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1871")
    name = "subProj 1871"

    buildType(subProj_bt_1871_5)
    buildType(subProj_bt_1871_3)
    buildType(subProj_bt_1871_4)
    buildType(subProj_bt_1871_1)
    buildType(subProj_bt_1871_2)
    buildType(subProj_bt_1871_0)
})
