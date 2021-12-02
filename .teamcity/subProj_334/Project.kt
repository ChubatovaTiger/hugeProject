package subProj_334

import subProj_334.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_334")
    name = "subProj 334"

    buildType(subProj_bt_334_3)
    buildType(subProj_bt_334_2)
    buildType(subProj_bt_334_1)
    buildType(subProj_bt_334_0)
    buildType(subProj_bt_334_5)
    buildType(subProj_bt_334_4)
})
