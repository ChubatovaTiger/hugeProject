package subProj_768

import subProj_768.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_768")
    name = "subProj 768"

    buildType(subProj_bt_768_4)
    buildType(subProj_bt_768_3)
    buildType(subProj_bt_768_5)
    buildType(subProj_bt_768_0)
    buildType(subProj_bt_768_2)
    buildType(subProj_bt_768_1)
})
