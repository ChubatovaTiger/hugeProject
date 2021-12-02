package subProj_1007

import subProj_1007.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1007")
    name = "subProj 1007"

    buildType(subProj_bt_1007_2)
    buildType(subProj_bt_1007_3)
    buildType(subProj_bt_1007_0)
    buildType(subProj_bt_1007_1)
    buildType(subProj_bt_1007_4)
    buildType(subProj_bt_1007_5)
})
