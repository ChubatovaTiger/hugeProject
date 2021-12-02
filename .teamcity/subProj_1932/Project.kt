package subProj_1932

import subProj_1932.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1932")
    name = "subProj 1932"

    buildType(subProj_bt_1932_2)
    buildType(subProj_bt_1932_1)
    buildType(subProj_bt_1932_0)
    buildType(subProj_bt_1932_5)
    buildType(subProj_bt_1932_4)
    buildType(subProj_bt_1932_3)
})
