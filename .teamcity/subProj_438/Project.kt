package subProj_438

import subProj_438.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_438")
    name = "subProj 438"

    buildType(subProj_bt_438_0)
    buildType(subProj_bt_438_2)
    buildType(subProj_bt_438_1)
    buildType(subProj_bt_438_4)
    buildType(subProj_bt_438_3)
    buildType(subProj_bt_438_5)
})
