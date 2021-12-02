package subProj_806

import subProj_806.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_806")
    name = "subProj 806"

    buildType(subProj_bt_806_0)
    buildType(subProj_bt_806_1)
    buildType(subProj_bt_806_2)
    buildType(subProj_bt_806_3)
    buildType(subProj_bt_806_4)
    buildType(subProj_bt_806_5)
})
