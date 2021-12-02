package subProj_196

import subProj_196.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_196")
    name = "subProj 196"

    buildType(subProj_bt_196_0)
    buildType(subProj_bt_196_1)
    buildType(subProj_bt_196_4)
    buildType(subProj_bt_196_5)
    buildType(subProj_bt_196_2)
    buildType(subProj_bt_196_3)
})
