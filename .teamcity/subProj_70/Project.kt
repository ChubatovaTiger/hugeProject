package subProj_70

import subProj_70.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_70")
    name = "subProj 70"

    buildType(subProj_bt_70_3)
    buildType(subProj_bt_70_4)
    buildType(subProj_bt_70_1)
    buildType(subProj_bt_70_2)
    buildType(subProj_bt_70_5)
    buildType(subProj_bt_70_0)
})
