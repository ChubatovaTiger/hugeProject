package subProj_173

import subProj_173.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_173")
    name = "subProj 173"

    buildType(subProj_bt_173_0)
    buildType(subProj_bt_173_2)
    buildType(subProj_bt_173_1)
    buildType(subProj_bt_173_4)
    buildType(subProj_bt_173_3)
    buildType(subProj_bt_173_5)
})
