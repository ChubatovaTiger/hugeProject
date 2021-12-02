package subProj_1181

import subProj_1181.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1181")
    name = "subProj 1181"

    buildType(subProj_bt_1181_0)
    buildType(subProj_bt_1181_5)
    buildType(subProj_bt_1181_1)
    buildType(subProj_bt_1181_2)
    buildType(subProj_bt_1181_3)
    buildType(subProj_bt_1181_4)
})
