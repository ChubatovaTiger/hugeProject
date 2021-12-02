package subProj_208

import subProj_208.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_208")
    name = "subProj 208"

    buildType(subProj_bt_208_0)
    buildType(subProj_bt_208_1)
    buildType(subProj_bt_208_2)
    buildType(subProj_bt_208_3)
    buildType(subProj_bt_208_4)
    buildType(subProj_bt_208_5)
})
