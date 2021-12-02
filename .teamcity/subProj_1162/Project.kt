package subProj_1162

import subProj_1162.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1162")
    name = "subProj 1162"

    buildType(subProj_bt_1162_1)
    buildType(subProj_bt_1162_0)
    buildType(subProj_bt_1162_5)
    buildType(subProj_bt_1162_4)
    buildType(subProj_bt_1162_3)
    buildType(subProj_bt_1162_2)
})
