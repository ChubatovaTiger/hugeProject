package subProj_893

import subProj_893.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_893")
    name = "subProj 893"

    buildType(subProj_bt_893_0)
    buildType(subProj_bt_893_1)
    buildType(subProj_bt_893_2)
    buildType(subProj_bt_893_3)
    buildType(subProj_bt_893_4)
    buildType(subProj_bt_893_5)
})
