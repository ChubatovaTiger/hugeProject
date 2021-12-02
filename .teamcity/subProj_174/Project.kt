package subProj_174

import subProj_174.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_174")
    name = "subProj 174"

    buildType(subProj_bt_174_1)
    buildType(subProj_bt_174_0)
    buildType(subProj_bt_174_3)
    buildType(subProj_bt_174_2)
    buildType(subProj_bt_174_5)
    buildType(subProj_bt_174_4)
})
