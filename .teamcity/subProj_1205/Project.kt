package subProj_1205

import subProj_1205.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1205")
    name = "subProj 1205"

    buildType(subProj_bt_1205_5)
    buildType(subProj_bt_1205_4)
    buildType(subProj_bt_1205_3)
    buildType(subProj_bt_1205_2)
    buildType(subProj_bt_1205_1)
    buildType(subProj_bt_1205_0)
})
