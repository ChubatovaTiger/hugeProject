package subProj_1327

import subProj_1327.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1327")
    name = "subProj 1327"

    buildType(subProj_bt_1327_5)
    buildType(subProj_bt_1327_3)
    buildType(subProj_bt_1327_4)
    buildType(subProj_bt_1327_1)
    buildType(subProj_bt_1327_2)
    buildType(subProj_bt_1327_0)
})
