package subProj_220

import subProj_220.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_220")
    name = "subProj 220"

    buildType(subProj_bt_220_5)
    buildType(subProj_bt_220_4)
    buildType(subProj_bt_220_1)
    buildType(subProj_bt_220_0)
    buildType(subProj_bt_220_3)
    buildType(subProj_bt_220_2)
})
