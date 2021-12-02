package subProj_1897

import subProj_1897.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1897")
    name = "subProj 1897"

    buildType(subProj_bt_1897_4)
    buildType(subProj_bt_1897_3)
    buildType(subProj_bt_1897_2)
    buildType(subProj_bt_1897_1)
    buildType(subProj_bt_1897_0)
    buildType(subProj_bt_1897_5)
})
