package subProj_150

import subProj_150.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_150")
    name = "subProj 150"

    buildType(subProj_bt_150_0)
    buildType(subProj_bt_150_1)
    buildType(subProj_bt_150_2)
    buildType(subProj_bt_150_3)
    buildType(subProj_bt_150_4)
    buildType(subProj_bt_150_5)
})
