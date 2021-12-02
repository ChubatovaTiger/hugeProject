package subProj_236

import subProj_236.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_236")
    name = "subProj 236"

    buildType(subProj_bt_236_4)
    buildType(subProj_bt_236_3)
    buildType(subProj_bt_236_5)
    buildType(subProj_bt_236_0)
    buildType(subProj_bt_236_2)
    buildType(subProj_bt_236_1)
})
