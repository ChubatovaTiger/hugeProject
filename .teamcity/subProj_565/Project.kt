package subProj_565

import subProj_565.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_565")
    name = "subProj 565"

    buildType(subProj_bt_565_1)
    buildType(subProj_bt_565_0)
    buildType(subProj_bt_565_3)
    buildType(subProj_bt_565_2)
    buildType(subProj_bt_565_5)
    buildType(subProj_bt_565_4)
})
