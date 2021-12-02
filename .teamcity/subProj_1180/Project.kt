package subProj_1180

import subProj_1180.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1180")
    name = "subProj 1180"

    buildType(subProj_bt_1180_0)
    buildType(subProj_bt_1180_1)
    buildType(subProj_bt_1180_2)
    buildType(subProj_bt_1180_3)
    buildType(subProj_bt_1180_4)
    buildType(subProj_bt_1180_5)
})
