package subProj_918

import subProj_918.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_918")
    name = "subProj 918"

    buildType(subProj_bt_918_5)
    buildType(subProj_bt_918_4)
    buildType(subProj_bt_918_3)
    buildType(subProj_bt_918_2)
    buildType(subProj_bt_918_1)
    buildType(subProj_bt_918_0)
})
