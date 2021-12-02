package subProj_523

import subProj_523.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_523")
    name = "subProj 523"

    buildType(subProj_bt_523_5)
    buildType(subProj_bt_523_4)
    buildType(subProj_bt_523_3)
    buildType(subProj_bt_523_2)
    buildType(subProj_bt_523_1)
    buildType(subProj_bt_523_0)
})
