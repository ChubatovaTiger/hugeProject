package subProj_852

import subProj_852.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_852")
    name = "subProj 852"

    buildType(subProj_bt_852_1)
    buildType(subProj_bt_852_2)
    buildType(subProj_bt_852_0)
    buildType(subProj_bt_852_5)
    buildType(subProj_bt_852_3)
    buildType(subProj_bt_852_4)
})
