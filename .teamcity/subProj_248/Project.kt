package subProj_248

import subProj_248.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_248")
    name = "subProj 248"

    buildType(subProj_bt_248_4)
    buildType(subProj_bt_248_5)
    buildType(subProj_bt_248_2)
    buildType(subProj_bt_248_3)
    buildType(subProj_bt_248_0)
    buildType(subProj_bt_248_1)
})
