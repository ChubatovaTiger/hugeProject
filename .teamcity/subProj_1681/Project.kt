package subProj_1681

import subProj_1681.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1681")
    name = "subProj 1681"

    buildType(subProj_bt_1681_3)
    buildType(subProj_bt_1681_2)
    buildType(subProj_bt_1681_1)
    buildType(subProj_bt_1681_0)
    buildType(subProj_bt_1681_5)
    buildType(subProj_bt_1681_4)
})
