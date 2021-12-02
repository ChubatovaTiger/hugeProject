package subProj_254

import subProj_254.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_254")
    name = "subProj 254"

    buildType(subProj_bt_254_5)
    buildType(subProj_bt_254_3)
    buildType(subProj_bt_254_4)
    buildType(subProj_bt_254_1)
    buildType(subProj_bt_254_2)
    buildType(subProj_bt_254_0)
})
