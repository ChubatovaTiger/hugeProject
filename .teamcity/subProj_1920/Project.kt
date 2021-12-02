package subProj_1920

import subProj_1920.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1920")
    name = "subProj 1920"

    buildType(subProj_bt_1920_2)
    buildType(subProj_bt_1920_3)
    buildType(subProj_bt_1920_0)
    buildType(subProj_bt_1920_1)
    buildType(subProj_bt_1920_4)
    buildType(subProj_bt_1920_5)
})
