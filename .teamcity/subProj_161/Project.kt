package subProj_161

import subProj_161.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_161")
    name = "subProj 161"

    buildType(subProj_bt_161_0)
    buildType(subProj_bt_161_1)
    buildType(subProj_bt_161_2)
    buildType(subProj_bt_161_3)
    buildType(subProj_bt_161_4)
    buildType(subProj_bt_161_5)
})
