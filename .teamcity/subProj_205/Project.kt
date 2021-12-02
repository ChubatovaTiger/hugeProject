package subProj_205

import subProj_205.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_205")
    name = "subProj 205"

    buildType(subProj_bt_205_1)
    buildType(subProj_bt_205_2)
    buildType(subProj_bt_205_3)
    buildType(subProj_bt_205_4)
    buildType(subProj_bt_205_0)
    buildType(subProj_bt_205_5)
})
