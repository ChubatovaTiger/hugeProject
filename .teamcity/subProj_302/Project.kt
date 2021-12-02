package subProj_302

import subProj_302.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_302")
    name = "subProj 302"

    buildType(subProj_bt_302_1)
    buildType(subProj_bt_302_2)
    buildType(subProj_bt_302_0)
    buildType(subProj_bt_302_5)
    buildType(subProj_bt_302_3)
    buildType(subProj_bt_302_4)
})
