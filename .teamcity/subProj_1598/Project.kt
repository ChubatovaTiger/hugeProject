package subProj_1598

import subProj_1598.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1598")
    name = "subProj 1598"

    buildType(subProj_bt_1598_4)
    buildType(subProj_bt_1598_3)
    buildType(subProj_bt_1598_5)
    buildType(subProj_bt_1598_0)
    buildType(subProj_bt_1598_2)
    buildType(subProj_bt_1598_1)
})
