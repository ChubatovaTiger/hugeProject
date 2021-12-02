package subProj_339

import subProj_339.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_339")
    name = "subProj 339"

    buildType(subProj_bt_339_2)
    buildType(subProj_bt_339_1)
    buildType(subProj_bt_339_0)
    buildType(subProj_bt_339_5)
    buildType(subProj_bt_339_4)
    buildType(subProj_bt_339_3)
})
