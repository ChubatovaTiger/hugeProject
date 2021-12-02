package subProj_304

import subProj_304.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_304")
    name = "subProj 304"

    buildType(subProj_bt_304_0)
    buildType(subProj_bt_304_3)
    buildType(subProj_bt_304_4)
    buildType(subProj_bt_304_1)
    buildType(subProj_bt_304_2)
    buildType(subProj_bt_304_5)
})
